package com.decorator;

import java.util.ArrayList;
import java.util.List;

public class XML_News extends Component {

	@Override
	protected List<News> getListOfNews() {
		List<News> list = new ArrayList<News>();
		System.out.println("��xml�ж�ȡ����");
		return list;
	}

}
