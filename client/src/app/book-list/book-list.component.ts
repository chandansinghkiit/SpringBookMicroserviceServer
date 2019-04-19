
import { Component, OnInit } from '@angular/core';
import { BookService } from '../shared/book/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  books: Array<any>;

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.bookService.getAll().subscribe(data => {
      this.books = data;
    });
  }
}
