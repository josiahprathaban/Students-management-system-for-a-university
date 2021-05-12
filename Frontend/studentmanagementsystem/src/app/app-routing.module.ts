import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { LoginComponent } from './login/login.component';
import { StudentHomeComponent } from './student-home/student-home.component';
import { AdminAddStudentComponent } from './admin-add-student/admin-add-student.component'


const routes: Routes = [
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"login", component:LoginComponent},
  {path:"student", component:StudentHomeComponent},
  {path:"admin", component:AdminHomeComponent},
  {path:"admin/addstudent", component:AdminAddStudentComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
