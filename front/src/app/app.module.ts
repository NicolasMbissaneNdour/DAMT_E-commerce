import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminLoginComponent } from './component/admin/admin-login/admin-login.component';
import { UserLoginComponent } from './component/user/user-login/user-login.component';
import { UserRegisterComponent } from './component/user/user-register/user-register.component';
import { UserHomeComponent } from './component/user/user-home/user-home.component';
import { UserSingleProduitComponent } from './component/user/user-single-produit/user-single-produit.component';
import { AdminHomeComponent } from './component/admin/admin-home/admin-home.component';
import { AdminProduitComponent } from './component/admin/admin-produit/admin-produit.component';
import { AdminSingleProduitComponent } from './component/admin/admin-single-produit/admin-single-produit.component';
import { AdminSingleCatProduitComponent } from './component/admin/admin-single-cat-produit/admin-single-cat-produit.component';
import { AdminCatProduitComponent } from './component/admin/admin-cat-produit/admin-cat-produit.component';
import { AdminCommandeComponent } from './component/admin/admin-commande/admin-commande.component';
import { AdminSingleCommandeComponent } from './component/admin/admin-single-commande/admin-single-commande.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './module/material/material.module';
import { AdminNavigationComponent } from './component/util/admin-navigation/admin-navigation.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { AdminUserComponent } from './component/admin/admin-user/admin-user.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    UserLoginComponent,
    UserRegisterComponent,
    UserHomeComponent,
    UserSingleProduitComponent,
    AdminHomeComponent,
    AdminProduitComponent,
    AdminSingleProduitComponent,
    AdminSingleCatProduitComponent,
    AdminCatProduitComponent,
    AdminCommandeComponent,
    AdminSingleCommandeComponent,
    AdminNavigationComponent,
    AdminUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
