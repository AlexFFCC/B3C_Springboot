package com.alex.buy3c;

import java.util.LinkedList;
import java.util.Queue;

interface Request {
	void execute();
}

public class RequestQueue {

	public static void main(String[] args) {
		var requests = new LinkedList();
		offerRequestTo(requests);
		process(requests);

	}
	//加入
	static void offerRequestTo(Queue requests) {
		for(var i = 1;i<6;i++) {
			var request = new Request() {
				public void execute() {
					System.out.printf("處理資料 %f%n",Math.random());
				}
			};
			requests.offer(request);
		}
		
	}
	//請求
	static void process(Queue requests) {
		while(requests.peek()!=null) {
			var request = (Request)requests.poll();
			request.execute();
		}
	}
}
