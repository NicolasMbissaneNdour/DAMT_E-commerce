import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminCatProduitComponent } from './component/admin/admin-cat-produit/admin-cat-produit.component';
import { AdminCommandeComponent } from './component/admin/admin-commande/admin-commande.component';
import { AdminHomeComponent } from './component/admin/admin-home/admin-home.component';
import { AdminProduitComponent } from './component/admin/admin-produit/admin-produit.component';
import { AdminUserComponent } from './component/admin/admin-user/admin-user.component';
import { AdminNavigationComponent } from './component/util/admin-navigation/admin-navigation.component';

const routes: Routes = [
  {
    path: 'admin',
    component: AdminNavigationComponent,
    children: [
      {
        path: '',
        component: AdminHomeComponent
      },
      {
        path: 'commande',
        component: AdminCommandeComponent
      },
      {
        path: 'client',
        component: AdminUserComponent
      },
      {
        path: 'produit',
        component: AdminProduitComponent
      },
      {
        path: 'catproduit',
        component: AdminCatProduitComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
