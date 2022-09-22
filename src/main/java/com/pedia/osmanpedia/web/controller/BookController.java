package com.pedia.osmanpedia.web.controller;

import com.pedia.osmanpedia.domain.BookDomain;
import com.pedia.osmanpedia.domain.service.BookService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    @ApiOperation("Obtiene todas los libros")
    @ApiResponse(code = 200 , message = "Ok")
    public ResponseEntity<List<BookDomain>>  getAll(){
        return new ResponseEntity<>(bookService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idBook}")
    @ApiOperation("Obtiene el libro por su id")
    @ApiResponses({
            @ApiResponse(code = 200 , message = "Ok"),
            @ApiResponse(code = 404 , message = "No ha sido encontrado")
    })
    public ResponseEntity<BookDomain> getBook(@ApiParam(value = "the id of the Book" , required = true , example = "3") @PathVariable("idBook")  int idBook){
        return bookService.getBook(idBook)
                .map(BookResponse -> new ResponseEntity<>(BookResponse ,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<BookDomain>>getBookByEstado(@PathVariable("estado")boolean estado){
        return bookService.getBookbyEstado(estado).map(BookResponse -> new ResponseEntity<>(BookResponse ,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND ));
    }

    @PostMapping("/save")
    public ResponseEntity<BookDomain> save(@RequestBody  BookDomain bookDomain){
        return new ResponseEntity<>(bookService.save(bookDomain) , HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idBook}")
    public  ResponseEntity<Boolean> delete(@PathVariable("idBook") int idBook){
        if(bookService.delete(idBook)){
            return new ResponseEntity<>( HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false ,HttpStatus.NOT_FOUND);
        }

    }
}
