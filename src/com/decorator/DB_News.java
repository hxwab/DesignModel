package com.decorator;

import java.util.ArrayList;
import java.util.List;

public class DB_News extends Component {

	@Override
	protected List<News> getListOfNews() {
		List<News> list = new ArrayList<News>();
		System.out.println("从数据库中读取新闻");
		return list;
	}

}
