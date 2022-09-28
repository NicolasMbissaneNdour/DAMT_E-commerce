import { User } from "./user";

export interface Client extends User {
  nom?: String;
  prenom?: String;
  adresse?: String;
  telephone?: String;
}
