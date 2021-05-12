import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin-add-student',
  templateUrl: './admin-add-student.component.html',
  styleUrls: ['./admin-add-student.component.scss']
})
export class AdminAddStudentComponent implements OnInit {

  id:string;
  name:string;
  username:string;
  password:string;
  constructor() { }

  ngOnInit(): void {
  }

  onIdChange(id: string): void {
    console.log(id);
  }

  onNameChange(name: string): void {
    console.log(name);
  }

}
