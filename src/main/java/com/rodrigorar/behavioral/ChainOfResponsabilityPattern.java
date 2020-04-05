package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.chain_of_responsability.Chain;
import com.rodrigorar.behavioral.chain_of_responsability.HandlerOne;
import com.rodrigorar.behavioral.chain_of_responsability.HandlerTwo;
import com.rodrigorar.behavioral.chain_of_responsability.Request;
import com.rodrigorar.behavioral.chain_of_responsability.Response;

import java.util.ArrayList;
import java.util.List;

public class ChainOfResponsabilityPattern {
	public static void main(String[] args) {
		Chain chain = new Chain();
		chain.register(new HandlerOne());
		chain.register(new HandlerTwo());
		chain.register(new HandlerTwo());
		chain.register(new HandlerTwo());
		chain.register(new HandlerOne());

		List<String> request1Args =  new ArrayList();
		request1Args.add("req-1-arg1");
		request1Args.add("req-1-arg2");
		request1Args.add("req-1-arg3");
		Request request1 = new Request(request1Args);
		Response response1 = chain.send(request1);
		System.out.println("Request 1 in Chain");
		request1.print();
		response1.print();

		List<String> request2Args =  new ArrayList();
		request2Args.add("req-2-arg1");
		request2Args.add("req-2-arg2");
		request2Args.add("req-2-arg3");
		request2Args.add("req-2-arg4");
		request2Args.add("req-2-arg5");
		Request request2 = new Request(request2Args);
		Response response2 = chain.send(request2);
		System.out.println("Request 2 in Chain");
		request2.print();
		response2.print();

		List<String> request3Args =  new ArrayList();
		request3Args.add("req-3-arg1");
		request3Args.add("req-3-arg2");
		request3Args.add("req-3-arg3");
		request3Args.add("req-3-arg4");
		request3Args.add("req-3-arg5");
		request3Args.add("req-3-arg6");
		request3Args.add("req-3-arg67");
		Request request3 = new Request(request3Args);
		Response response3 = chain.send(request3);
		System.out.println("Request 3 in Chain");
		request3.print();
		response3.print();
	}
}
