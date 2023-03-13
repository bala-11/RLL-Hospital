import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppointmentComponent } from 'src/appointment/appointment.component';
import { AdddoctorComponent } from './adddoctor/adddoctor.component';
import { AddpatientComponent } from './addpatient/addpatient.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AdminLogin } from './admin-login';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminSignupComponent } from './admin-signup/admin-signup.component';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { CreateInvoiceComponent } from './create-invoice/create-invoice.component';
import { DischargedPatientComponent } from './discharged-patient/discharged-patient.component';
import { DischargepatientComponent } from './dischargepatient/dischargepatient.component';
import { DoctorPatientsComponent } from './doctor-patients/doctor-patients.component';
import { DoctorComponent } from './doctor/doctor.component';
import { DoctorappointmentsComponent } from './doctorappointments/doctorappointments.component';
import { GetDocidComponent } from './get-docid/get-docid.component';
import { GetpatidComponent } from './getpatid/getpatid.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { LoginComponent } from './login/login.component';
import { MainPageComponent } from './main-page/main-page.component';
import { PatientAdmitComponent } from './patient-admit/patient-admit.component';
import { PatientAppointmentComponent } from './patient-appointment/patient-appointment.component';
import { PatientComponent } from './patient/patient.component';
import { RetrieveDoctorsComponent } from './retrieve-doctors/retrieve-doctors.component';
import { SignupComponent } from './signup/signup.component';
import { ViewDoctorComponent } from './view-doctor/view-doctor.component';
import { ViewIdComponent } from './view-id/view-id.component';
import { ViewpatientComponent } from './viewpatient/viewpatient.component';

const routes: Routes = [
  {path:"login", component:LoginComponent},
  {path:"signUp", component:SignupComponent},
  {path:"",redirectTo:"main", pathMatch:"full"},
  {path:"main", component:MainPageComponent},
  {path:"admin-login", component:AdminLoginComponent},
  {path:"admin-signup", component:AdminSignupComponent},
  {path:"doctor",component:DoctorComponent, children :[
    {path:"getid", component:GetDocidComponent},
    {path:"viewApp", component:DoctorappointmentsComponent},
    {path:"viewPat", component:DoctorPatientsComponent},
    {path:"dispat", component:DischargedPatientComponent} 
  ]},
  {path:"viewId", component:ViewIdComponent},
  {path:"applyJob", component:ApplyJobComponent},
  {path:"patient",component:PatientComponent, children :[
    {path:"appointment", component:PatientAppointmentComponent}, 
    {path:"getpatid", component:GetpatidComponent},                    //need to add
    // {path:"viewdoc", component:PatientDoctorComponent},
     ]},
  {path:"savepat", component:PatientAdmitComponent},
  {path:"admin-dashboard",component:AdminDashboardComponent, children:[
    {path:"AddDoctor",component:AdddoctorComponent},
    {path:"AddPatient",component:AddpatientComponent},
  
    // {path:"aboutus",component:HomeComponent},
    // {path:"login",component:LoginComponent},
    {path:"Total doctors",component:RetrieveDoctorsComponent},
    // {path:"AddDoctor",component:AdddoctorComponent},
    // {path:"AddPatient",component:AddpatientComponent},
    {path:"ViewPatient",component:ViewpatientComponent},
    {path:"ViewDoctor",component:ViewDoctorComponent},
    {path:"Invoice",component:InvoiceComponent},
    {path:"create-invoice",component:CreateInvoiceComponent},
    {path:"appointment",component:AppointmentComponent},
    {path:"dischargePatient",component:DischargepatientComponent},
  ]},
 
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


