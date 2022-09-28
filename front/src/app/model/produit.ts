import { CatProduit } from "./cat-produit";

export interface Produit {
  libelle?: String;
  prix?: number;
  date: String;
  stock?: boolean;
  url?: String;
  categorie?: CatProduit;
}
