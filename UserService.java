package com.example.project;//�˻���¼��ע��
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UserService {
	private DBHelper sdb; 
	//��¼
	public boolean login(String userId,String userPassword){ 
		SQLiteDatabase db=sdb.getWritableDatabase(); 
		String sql="select *from user where userId=? and userPassword=?";
		Cursor cursor=db.rawQuery(sql,new String[]{userId,userPassword});
		if(cursor.moveToFirst()==true){
			cursor.close();
			return true;
		}
		return false;
	}
	
	//ע��
	public boolean register(UserData user){  
        SQLiteDatabase db=sdb.getReadableDatabase();  
        String sql="insert into user(userId,userName,userPassword,0) values(?,?,?,?)";  
        Object obj[]={user.getUserId(),user.getUserName(),user.getUserPassword(),user.getUserState()};  
        db.execSQL(sql, obj);    
        return true;  
    }
	
}
	
	


