package com.simple.ws.cxf.client;

import java.util.Calendar;
import java.util.Date;

import com.simple.ws.cxf.Absences;
import com.simple.ws.cxf.Absenses;
import com.simple.ws.cxf.HumanResourceService;
import com.simple.ws.cxf.HumanResourceServiceImplService;

public class HumanResourceClient {
	public static void main(String args[]) {
		try {
			HumanResourceServiceImplService hrServiceImpl = new HumanResourceServiceImplService();
			HumanResourceService hrService = hrServiceImpl
					.getHumanResourceServiceImplPort();
			
			
			Calendar calendar=Calendar.getInstance();
			Date startDate=calendar.getTime();
			calendar.add(Calendar.DATE, 10);
			Date endDate=calendar.getTime();
			
			hrService.bookHoliday(startDate,endDate, "Srinivas");
			System.err.println("BOOKED");
			System.err.println("sum of 4 and 5 is " + hrService.add(4, 5));
			
			int count = hrService.count();
			System.err.println("count = " + count);
			
			Absenses absenses = hrService.getAbsenses("P000201466");
			System.err.println("Absenses = " + absenses.getAbsenseCount() + " : " + absenses.getTardyCount());
			
			for (Absences a: absenses.getAbsenses()) {
				System.err.println("abs = " + a.getDateAbsent());
			}
			
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
