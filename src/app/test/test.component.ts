import { Component } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent {
  serverID: number = 10;  
  serverStatus: string = 'Online';
  isUnchanged = false;
  bool=false;

}
