import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { MainPageComponent } from './main-page/main-page.component';
import { FooterComponent } from './footer/footer.component';
import { AdminSignupComponent } from './admin-signup/admin-signup.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { DoctorComponent } from './doctor/doctor.component';
import { DoctorPatientsComponent } from './doctor-patients/doctor-patients.component';
import { GetDocidComponent } from './get-docid/get-docid.component';
import { ViewIdComponent } from './view-id/view-id.component';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { DoctorappointmentsComponent } from './doctorappointments/doctorappointments.component';
import { DischargedPatientComponent } from './discharged-patient/discharged-patient.component';
import { PatientAdmitComponent } from './patient-admit/patient-admit.component';
import { PatientAppointmentComponent } from './patient-appointment/patient-appointment.component';
import { PatientComponent } from './patient/patient.component';
import { GetpatidComponent } from './getpatid/getpatid.component';
import { AdddoctorComponent } from './adddoctor/adddoctor.component';
import { AddpatientComponent } from './addpatient/addpatient.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AppointmentComponent } from 'src/appointment/appointment.component';
import { CreateInvoiceComponent } from './create-invoice/create-invoice.component';
import { DischargepatientComponent } from './dischargepatient/dischargepatient.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { RetrieveDoctorsComponent } from './retrieve-doctors/retrieve-doctors.component';
import { ViewDoctorComponent } from './view-doctor/view-doctor.component';
import { ViewpatientComponent } from './viewpatient/viewpatient.component';

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    LoginComponent,
    MainPageComponent,
    FooterComponent,
    AdminSignupComponent,
    AdminLoginComponent,
    DischargedPatientComponent,
    DoctorComponent,
    DoctorappointmentsComponent,
    DoctorPatientsComponent,
    ApplyJobComponent,
    ViewIdComponent,
    GetDocidComponent,
    PatientAdmitComponent,
    PatientAppointmentComponent,
    // PatientDoctorComponent,
    PatientComponent,
    GetpatidComponent,
    AdddoctorComponent,
    AddpatientComponent,

    AdminDashboardComponent,
    RetrieveDoctorsComponent,
    // AdddoctorComponent,
    // AddpatientComponent,
    ViewpatientComponent,
    ViewDoctorComponent,
    InvoiceComponent,
    CreateInvoiceComponent,
    AppointmentComponent,
    // ViewAllpatientsComponent,
    DischargepatientComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
