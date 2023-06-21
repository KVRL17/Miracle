import { Component } from '@angular/core';
import { PostService } from './services/post.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }
  posts:any;
  constructor(private service:PostService) {}
  ngOnInit() {

      this.service.getPosts()

        .subscribe(response => {

          this.posts = response;

        });

  }

}