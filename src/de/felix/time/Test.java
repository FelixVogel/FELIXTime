/**
   Copyright 2019 Felix Vogel

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package de.felix.time;

import java.time.OffsetDateTime;

/**
 * Created by Felix Vogel on 25/12/18
 */
public class Test {

	public static void main(final String[] args) {

		final OffsetDateTime odt = FELIXTimeZone.CET.getTimeFor(2019, 1, 29, 17, 0, 0, 0);

		FELIXTimeZone.getZonesFor(odt).forEach(zone -> System.out.println(zone.getName()));

		//		int at = 0;
		//
		//		for(final FELIXTimeZone ftz : FELIXTimeZone.values()) {
		//			System.out.print((ftz.name() + "                    ").substring(0, 15) + " " + format(ftz.getTime(odt)));
		//			at += 1;
		//
		//			if(at == 4) {
		//				System.out.println();
		//				at = 0;
		//			}
		//			else System.out.print(" | ");
		//		}
	}

	public static String format(final OffsetDateTime odt) {
		return (odt.getHour() < 10 ? "0" : "") + odt.getHour() + ":" +
				(odt.getMinute() < 10 ? "0" : "") + odt.getMinute() + " " +
				(odt.getDayOfMonth() < 10 ? "0" : "") +  odt.getDayOfMonth() + "/" +
				(odt.getMonthValue() < 10 ? "0" : "") +  odt.getMonthValue() + "/" + odt.getYear();
	}

}
