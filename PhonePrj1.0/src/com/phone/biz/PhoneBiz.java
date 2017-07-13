package com.phone.biz;

import java.util.ArrayList;
import java.util.List;

import com.phone.po.Phone;

public interface PhoneBiz {
	//增加
	public boolean addPhone(Phone phone);
	//删除
	public boolean deletePhone(int pid);
	//修改
	public boolean updatePhone(Phone phone);
	//查找
	public Phone getByID(int pid);
	//根据条件查找多个对象
	public List<Phone> findByConditon(String Conditon);
	//无条件查询
	public ArrayList<Phone> select();
	//打印电话本信息
	public boolean writePhonetxt(ArrayList<Phone> list,String path);
	
}
