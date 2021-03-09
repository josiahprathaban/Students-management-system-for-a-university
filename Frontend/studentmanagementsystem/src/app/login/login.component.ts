import { Component, OnInit } from '@angular/core';
import { RestApiService } from '../rest-api.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  username:string;
  password:string;
  usertype:any;

  constructor(private service:RestApiService) { }

  ngOnInit(): void {
  }

  logingIn(){
    console.log(this.username+this.password);
    let response = this.service.login(this.username, this.password);
    response.subscribe(data=>{
      console.log(data);
    })
  }
}
