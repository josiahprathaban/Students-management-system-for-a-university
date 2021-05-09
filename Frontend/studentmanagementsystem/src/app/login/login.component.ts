import { Component, OnInit } from '@angular/core';
import { RestApiService } from '../rest-api.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  logo:string = "../assets/images/hack.svg";
  heading:string = "SMS | LogIn";
  discription:string = "Student Management System";
  welcomeHead:string = "Welcome!";
  welcomeMess:string = "Please login to continue."
  username:string;
  password:string;
  usertype:any;

  constructor(private service:RestApiService, private router: Router) { }



  ngOnInit(): void {
  }

  logingIn(){
    let response = this.service.login(this.username, this.password);
    response.subscribe(data=>{
      if(data[0]['authority'] == "ROLE_STUDENT")
      {
        let response = this.service.student(this.username, this.password);
        response.subscribe(data=>{
        console.log(data);})
        this.router.navigate(['/student']);
      }
      if(data[0]['authority'] == "ROLE_ADMIN")
      {
        let response = this.service.admin(this.username, this.password);
        response.subscribe(data=>{
        console.log(data);})
        this.router.navigate(['/admin']);
      }
    })
  }
}
