package ir.mft.mftfridaysbahman97;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestDBHandler extends SQLiteOpenHelper {

    public static final int VERSION = 1;


    final String TABLE_NAME = "scores";

    String createTable = "" +
            "CREATE TABLE " +
            TABLE_NAME +
            "(" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name TEXT," +
            "family TEXT," +
            "score INTEGER" +
            ")" +
            "";

    public TestDBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    void insertStudent(String name, String family, int score) {

        String insertIntoDBQuery = "" +
                "INSERT INTO " +
                TABLE_NAME +
                "(" +
                "name," +
                "family," +
                "score" +
                ")" +
                "VALUES" +
                "(" +
                "'" + name + "'" + "," +
                "'" + family + "'" + "," +
                score +
                ")" +
                "";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(insertIntoDBQuery);

        db.close();

    }


    String getStudentNames() {
        String names = "";
        String getAllNamesQuery = "SELECT name FROM " + TABLE_NAME;


        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(getAllNamesQuery, null);

        while (cursor.moveToNext()) {
            names += cursor.getString(0) + "\n";
        }

        db.close();

        return names;


    }
}
