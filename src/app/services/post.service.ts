import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

  

@Injectable({

  providedIn: 'root'

})

export class PostService {

  private url = 'https://localhost:9999/fetch:';
  // private url = 'https://jsonplaceholder.typicode.com/posts';
  constructor(private httpClient: HttpClient) { }
  getPosts(){

    return this.httpClient.get(this.url);

  }

  

}
