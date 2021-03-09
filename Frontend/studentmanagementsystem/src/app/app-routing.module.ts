import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { LoginComponent } from './login/login.component';
import { StudentHomeComponent } from './student-home/student-home.component';


const routes: Routes = [
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"login", component:LoginComponent},
  {path:"student", component:StudentHomeComponent},
  {path:"admin", component:AdminHomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
