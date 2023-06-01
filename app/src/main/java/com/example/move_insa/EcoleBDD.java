package com.example.move_insa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Telephony;

public class EcoleBDD {
    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "Ecole.db";
    private static final String TABLE_ECOLE = "table_ecole";
    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_ECOLE = "Nom_ecole";
    private static final int NUM_COL_ECOLE = 1;
    private static final String COL_VILLE = "Ville";
    private static final int NUM_COL_VILLE = 2;
    private static final String COL_PAYS = "Pays";
    private static final int NUM_COL_PAYS = 3;

    private static final String COL_ADRESSE = "Adresse";

    private static final int NUM_COL_ADRESSE = 4;


    private static final String CREATE_TABLE_ECOLE = "CREATE TABLE " + TABLE_ECOLE + " ("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_ECOLE + " TEXT NOT NULL, "
            + COL_VILLE + " TEXT NOT NULL, " + COL_PAYS + "TEXT NOT NULL, " + COL_ADRESSE + "TEXT NOT NULL);";
    private SQLiteDatabase bdd;
    private MaBaseSQLite maBaseSQLite;

    public EcoleBDD(Context context) {
        //On crée la BDD et sa table
        maBaseSQLite = new MaBaseSQLite(context, NOM_BDD, null, VERSION_BDD);
    }

    public void open() {
        //on ouvre la BDD en écriture
        bdd = maBaseSQLite.getWritableDatabase();
    }

    public void close() {
        //on ferme l'accès à la BDD
        bdd.close();
        bdd.execSQL("DROP TABLE IF EXISTS "+NOM_BDD);
    }

    public SQLiteDatabase getBDD() {
        return bdd;
    }

    public long insertEcole(Ecole ecole) {
        ContentValues values = new ContentValues();
        values.put(COL_ECOLE, ecole.getEcole());
        values.put(COL_VILLE, ecole.getVille());
        values.put(COL_PAYS, ecole.getPays());
        //on insère l'objet dans la BDD via le ContentValues
        return bdd.insert(TABLE_ECOLE, null, values);
    }

    public int updateEcole(int id, Ecole ecole) {
        //La mise à jour d'un partenaire dans la BDD fonctionne plus ou moins comme une insertion
        //il faut simplement préciser quel partenaire on doit mettre à jour grâce à l'ID
        ContentValues values = new ContentValues();
        values.put(COL_ECOLE, ecole.getEcole());
        values.put(COL_VILLE, ecole.getVille());
        values.put(COL_PAYS, ecole.getPays());
        return bdd.update(TABLE_ECOLE, values, COL_ID + " = " + id, null);
    }

    public int removeEcoleWithID(int id) {
        //Suppression d'un partenaire de la BDD grâce à l'ID
        return bdd.delete(TABLE_ECOLE, COL_ID + " = " + id, null);
    }


    private Ecole cursorToEcole(Cursor c){
        //si aucun élément n'a été retourné dans la requête, on renvoie null
        if (c.getCount() == 0)
            return null;

        //Sinon on se place sur le premier élément
        c.moveToFirst();
        //On crée un partenaire
        Ecole ecole = new Ecole();
        //on lui affecte toutes les infos grâce aux infos contenues dans le Cursor
        ecole.setId(c.getInt(NUM_COL_ID));
        ecole.setEcole(c.getString(NUM_COL_ECOLE));
        ecole.setVille(c.getString(NUM_COL_VILLE));
        ecole.setPays(c.getString(NUM_COL_PAYS));
        ecole.setAdresse(c.getString(NUM_COL_ADRESSE));
        //On ferme le cursor
        c.close();
        //On retourne le partenaire
        return ecole;
    }
}