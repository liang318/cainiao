package com.example.project;//�������ݿ�
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
public abstract class DBHelper extends SQLiteOpenHelper{
	public  DBHelper(Context context,String name,CursorFactory factory,int version){
		super(context, name, factory, version);
    }
	private static final String DATABASENAME = "test.db"; //���ݿ����� 
    private static final int DATABASEVERSION = 1;//���ݿ�汾,����0 
    public  DBHelper(Context context) { 
    	super(context, DATABASENAME, null, DATABASEVERSION); 
    }
    public void onCreate(SQLiteDatabase db){
    	db.execSQL("CREATE TABLE user(userId integer primary key autoincrement,userName varchar(20),userPassword varchar(20),usrState int");//�����û���
    	//db.execSQL("CREATE TABLE ");//������
   }
}