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
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * All possible 198 time zones
 *
 * @since 24/12/2018
 * @author Felix Vogel
 */
public enum FELIXTimeZone {

	ACDT(10 * 60 + 30, "Australian Central Daylight Savings Time"),
	ACST(9 * 60 + 30, "Australian Central Standard Time"),
	ACT(-(5 * 60), "Acre Time"),
	ACWST(8 * 60 + 45, "Australian Central Western Standard Time"),
	ADT(-(3 * 60), "Atlantic Daylight Time"),
	AEDT(11 * 60, "Australian Eastern Daylight Savings Time"),
	AEST(10 * 60, "Australian Eastern Standard Time"),
	AFT(4 * 60 + 30, "Afghanistan Time"),
	AKDT(-(8 * 60), "Alaska Daylight Time"),
	AKST(-(9 * 60), "Alaska Standard Time"),
	AMST(-(3 * 60), "Amazon Summer Time (Brazil)"),
	AMT_BRAZIL(-(4 * 60), "Amazon Time (Brazil)"),
	AMT_ARMENIA(4 * 60, "Armenia Time"),
	ART(-(3 * 60), "Argentina Time"),
	AST_ARABIA(3 * 60, "Arabia Standard Time"),
	AST_ATLANTIC(-(4 * 60), "Atlantic Standard Time"),
	AWST(8 * 60, "Australian Western Standard Time"),
	AZOST(0, "Azores Summer Time"),
	AZOT(-(1 * 60), "Azores Standard Time"),
	AZT(4 * 60, "Azerbaijan Time"),
	BDT(8 * 60, "Brunei Time"),
	BIOT(6 * 60, "British Indian Ocean Time"),
	BIT(-(12 * 60), "Baker Island Time"),
	BOT(-(4 * 60), "Bolivia Time"),
	BRST(-(2 * 60), "Brasília Summer Time"),
	BRT(-(3 * 60), "Brasilia Time"),
	BST_BANGLADESH(6 * 60, "Bangladesh Standard Time"),
	BST_BOUGAINVILLE(11 * 60, "Bougainville Standard Time"),
	BST_BRITISH(1 * 60, "British Summer Time"),
	BTT(6 * 60, "Bhutan Time"),
	CAT(2 * 60, "Central Africa Time"),
	CCT(6 * 60 + 30, "Cocos Islands Time"),
	CDT_CENTRAL(-(5 * 60), "Central Daylight Time"),
	CDT_CUBA(-(4 * 60), "Cuba Daylight Time"),
	CEST(2 * 60, "Central European Summer Time"),
	CET(1 * 60, "Central European Time"),
	CHADT(13 * 60 + 45, "Chatham Daylight Time"),
	CHAST(12 * 60 + 45, "Chatham Standard Time"),
	CHOT(8 * 60, "Choibalsan Standard Time"),
	CHOST(9 * 60, "Choibalsan Summer Time"),
	CHST(10 * 60, "	Chamorro Standard Time"),
	CHUT(10 * 60, "Chuuk Time"),
	CIST(-(8 * 60), "Clipperton Island Standard Time"),
	CIT(8 * 60, "Central Indonesia Time"),
	CKT(-(10 * 60), "Cook Island Time"),
	CLST(-(3 * 60), "Chile Summer Time"),
	CLT(-(4 * 60), "Chile Standard Time"),
	COST(-(4 * 60), "Colombia Summer Time"),
	COT(-(5 * 60), "Colombia Time"),
	CST_CENTRAL(-(6 * 60), "Central Standard Time"),
	CST_CHINA(8 * 60, "China Standard Time"),
	CST_CUBA(-(5 * 60), "Cuba Standard Time"),
	CT(8 * 60, "China Time"),
	CVT(-(1 * 60), "Cape Verde Time"),
	CWST(8 * 60 + 45, "	Central Western Standard Time"),
	CXT(7 * 60, "Christmas Island Time"),
	DAVT(7 * 60, "Davis Time"),
	DDUT(10 * 60, "Dumont d'Urville Time"),
	DFT(1 * 60, "AIX-CET"),
	EASST(-(5 * 60), "Easter Island Summer Time"),
	EAST(-(6 * 60), "Easter Island Standard Time"),
	EAT(3 * 60, "East Africa Time"),
	ECT_CARIBBEAN(-(4 * 60), "Eastern Caribbean Time"),
	ECT_ECUADOR(-(5 * 60), "Ecuador Time"),
	EDT(-(4 * 60), "Eastern Daylight Time"),
	EEST(3 * 60, "Eastern European Summer Time"),
	EET(2 * 60, "Eastern European Time"),
	EGST(0, "Eastern Greenland Summer Time"),
	EGT(-(1 * 60), "Eastern Greenland Time"),
	EIT(9 * 60, "Eastern Indonesian Time"),
	EST(-(5 * 60), "Eastern Standard Time"),
	FET(3 * 60, "Further-eastern European Time"),
	FJT(12 * 60, "Fiji Time"),
	FKST(-(3 * 60), "Falkland Islands Summer Time"),
	FKT(-(4 * 60), "Falkland Islands Time"),
	FNT(-(2 * 60), "Fernando de Noronha Time"),
	GALT(-(6 * 60), "Galápagos Time"),
	GAMT(-(9 * 60), "Gambier Islands Time"),
	GET(4 * 60, "Georgia Standard Time"),
	GFT(-(3 * 60), "French Guiana Time"),
	GILT(12 * 60, "Gilbert Island Time"),
	GIT(-(9 * 60), "Gambier Island Time"),
	GMT(0, "Greenwich Mean Time"),
	GST_GEORGIA(-(2 * 60), "South Georgia and South Sandwich Islands Time"),
	GST_GULF(4 * 60, "Gulf Standard Time"),
	GYT(-(4 * 60), "Guyana Time"),
	HDT(-(9 * 60), "Hawaii–Aleutian Daylight Time"),
	HAEC(2 * 60, "Heure Avancée d'Europe Centrale"),
	HST(-(10 * 60), "Hawaii–Aleutian Standard Time"),
	HKT(8 * 60, "Hong Kong Time"),
	HMT(5 * 60, "Heard and McDonald Islands Time"),
	HOVST(8 * 60, "Khovd Summer Time"),
	HOVT(7 * 60, "Khovd Standard Time"),
	ICT(7 * 60, "Indochina Time"),
	IDLW(-(12 * 60), "International Day Line West time zone"),
	IDT(3 * 60, "Israel Daylight Time"),
	IOT(3 * 60, "Indian Ocean Time"),
	IRDT(4 * 60 + 30, "Iran Daylight Time"),
	IRKT(8 * 60, "Irkutsk Time"),
	IRST(3 * 60 + 30, "Iran Standard Time"),
	IST_INDIAN(5 * 60 + 30, "Indian Standard Time"),
	IST_IRISH(1 * 60, "Irish Standard Time"),
	IST_ISRAEL(2 * 60, "Israel Standard Time"),
	JST(9 * 60, "Japan Standard Time"),
	KALT(2 * 60, "Kaliningrad Time"),
	KGT(6 * 60, "Kyrgyzstan Time"),
	KOST(11 * 60, "Kosrae Time"),
	KRAT(7 * 60, "Krasnoyarsk Time"),
	KST(9 * 60, "Korea Standard Time"),
	LHST_STANDARD(10 * 60 + 30, "Lord Howe Standard Time"),
	LHST_SUMMER(11 * 60, "Lord Howe Summer Time"),
	LINT(14 * 60, "Line Islands Time"),
	MAGT(12 * 60, "Magadan Time"),
	MART(-(9 * 60 + 30), "Marquesas Islands Time"),
	MAWT(5 * 6, "Mawson Station Time"),
	MDT(-(6 * 60), "Mountain Daylight Time"),
	MET(1 * 60, "Middle European Time"),
	MEST(2 * 60, "Middle European Summer Time"),
	MHT(12 * 60, "Marshall Islands Time"),
	MIST(11 * 60, "Macquarie Island Station Time"),
	MIT(-(9 * 60 + 30), "Marquesas Islands Time"),
	MMT(6 * 60 + 30, "Myanmar Standard Time"),
	MSK(3 * 60, "Moscow Time"),
	MST_MALAYSIA(8 * 60, "Malaysia Standard Time"),
	MST_MOUNTAIN(-(7 * 60), "Mountain Standard Time"),
	MUT(4 * 60, "Mauritius Time"),
	MVT(5 * 60, "Maldives Time"),
	MYT(8 * 60, "Malaysia Time"),
	NCT(11 * 60, "New Caledonia Time"),
	NDT(-(2 * 60 + 30), "Newfoundland Daylight Time"),
	NFT(11 * 60, "Norfolk Island Time"),
	NPT(5 * 60 + 45, "Nepal Time"),
	NST(-(3 * 60 + 30), "Newfoundland Standard Time"),
	NT(-(3 * 60 + 30), "Newfoundland Time"),
	NUT(-(11 * 60), "Niue Time"),
	NZDT(13 * 60, "New Zealand Daylight Time"),
	NZST(12 * 60, "New Zealand Standard Time"),
	OMST(6 * 60, "Omsk Time"),
	ORAT(5 * 60, "Oral Time"),
	PDT(-(7 * 60), "Pacific Daylight Time"),
	PET(-(5 * 60), "Peru Time"),
	PETT(12 * 60, "Kamchatka Time"),
	PGT(10 * 60, "Papua New Guinea Time"),
	PHOT(13 * 60, "Phoenix Island Time"),
	PHT(8 * 60, "Philippine Time"),
	PKT(5 * 60, "Pakistan Standard Time"),
	PMDT(-(2 * 60), "Saint Pierre and Miquelon Daylight Time"),
	PMST(-(3 * 60), "Saint Pierre and Miquelon Standard Time"),
	PONT(11 * 60, "Pohnpei Standard Time"),
	PST_PACIFIC(-(8 * 60), "Pacific Standard Time"),
	PST_PHILIPPINE(8 * 60, "Philippine Standard Time"),
	PYST(-(3 * 60), "Paraguay Summer Time"),
	PYT(-(4 * 60), "Paraguay Time"),
	RET(4 * 60, "Réunion Time"),
	ROTT(-(3 * 60), "Rothera Research Station Time"),
	SAKT(11 * 60, "Sakhalin Island Time"),
	SAMT(4 * 60, "Samara Time"),
	SAST(2 * 60, "South African Standard Time"),
	SBT(11 * 60, "Solomon Islands Time"),
	SCT(4 * 60, "Seychelles Time"),
	SDT(-(10 * 60), "Samoa Daylight Time"),
	SGT(8 * 60, "Singapore Time"),
	SLST(5 * 60 + 30, "Sri Lanka Standard Time"),
	SRET(11 * 60, "Srednekolymsk Time"),
	SRT(-(3 * 60), "Suriname Time"),
	SST_SAMOA(-(11 * 60), "Samoa Standard Time"),
	SST_SINGAPORE(8 * 60, "Singapore Standard Time"),
	SYOT(3 * 60, "Showa Station Time"),
	TAHT(-(10 * 60), "Tahiti Time"),
	THA(7 * 60, "Thailand Standard Time"),
	TFT(5 * 60, "Indian/Kerguelen"),
	TJT(5 * 60, "Tajikistan Time"),
	TKT(13 * 60, "Tokelau Time"),
	TLT(9 * 60, "Timor Leste Time"),
	TMT(5 * 60, "Turkmenistan Time"),
	TRT(3 * 60, "Turkey Time"),
	TOT(13 * 60, "Tonga Time"),
	TVT(12 * 60, "Tuvalu Time"),
	ULAST(9 * 60, "Ulaanbaatar Summer Time"),
	ULAT(8 * 60, "Ulaanbaatar Standard Time"),
	UTC(0, "Coordinated Universal Time"),
	UYST(-(2 * 60), "Uruguay Summer Time"),
	UYT(-(3 * 60), "Uruguay Standard Time"),
	UZT(5 * 60, "Uzbekistan Time"),
	VET(-(4 * 60), "Venezuelan Standard Time"),
	VLAT(10 * 60, "Vladivostok Time"),
	VOLT(4 * 60, "Volgograd Time"),
	VOST(6 * 60, "Vostok Station Time"),
	VUT(11 * 60, "Vanuatu Time"),
	WAKT(12 * 60, "Wake Island Time"),
	WAST(2 * 60, "West Africa Summer Time"),
	WAT(1 * 60, "West Africa Time"),
	WEST(1 * 60, "Western European Summer Time"),
	WET(0, "Western European Time"),
	WIT(7 * 60, "Western Indonesian Time"),
	WST(8 * 60, "Western Standard Time"),
	YAKT(9 * 60, "Yakutsk Time"),
	YEKT(5 * 60, "Yekaterinburg Time")
	;

	// Class

	/**
	 * Get all time zones the defined {@link OffsetDateTime} could be in
	 *
	 * @param odt The {@link OffsetDateTime} to get the time zones for
	 * @return The {@link FELIXTimeZone} the defined {@link OffsetDateTime} could be in
	 */
	public static Collection<FELIXTimeZone> getZonesFor(final OffsetDateTime odt) {
		final int totalMinutes = odt.getOffset().getTotalSeconds() / 60;

		final List<FELIXTimeZone> zones = new LinkedList<>();

		for(final FELIXTimeZone ftz : FELIXTimeZone.values())
			if(ftz.utcOffset == totalMinutes) zones.add(ftz);

		return Collections.unmodifiableCollection(zones);
	}

	/**
	 * Convert a {@link OffsetDateTime} to the selected time zone
	 *
	 * @param odt The {@link OffsetDateTime} to convert
	 * @param zone The {@link FELIXTimeZone} to convert to
	 * @return The converted {@link OffsetDateTime}
	 */
	public static OffsetDateTime getTime(final OffsetDateTime odt, final FELIXTimeZone zone) {
		return zone.getTime(odt);
	}

	/**
	 * Get the time for a certain time zone at a certain point
	 *
	 * @param year The year
	 * @param month The month (1 - 12)
	 * @param day The day of the month
	 * @param hour The hour of the day
	 * @param minute The minute of the day
	 * @param second The second of the day
	 * @param nanoSecond The nanosecond of the day
	 * @param zone The {@link FELIXTimeZone} to set this time in
	 * @return The time in this certain zone
	 */
	public static OffsetDateTime getTimeFor(final int year, final int month, final int day, final int hour, final int minute, final int second, final int nanoSecond, final FELIXTimeZone zone) {
		return zone.getTimeFor(year, month, day, hour, minute, second, nanoSecond);
	}

	/**
	 * Convert a {@link OffsetDateTime} to UTC <br>
	 * This only will work properly if it has the correct offset
	 *
	 * @param odt The {@link OffsetDateTime} to convert to UTC
	 * @return The UTC {@link OffsetDateTime} of the defined {@link OffsetDateTime}
	 */
	private static OffsetDateTime toUTC(final OffsetDateTime odt) {
		final OffsetDateTime utcODT = odt.minusSeconds(odt.getOffset().getTotalSeconds());

		return OffsetDateTime.of(utcODT.getYear(), utcODT.getMonthValue(), utcODT.getDayOfMonth(), utcODT.getHour(), utcODT.getMinute(), utcODT.getSecond(), utcODT.getNano(), ZoneOffset.UTC);
	}

	private final long utcOffset;
	private final String name;

	private FELIXTimeZone(final long utcOffset, final String name) {
		this.utcOffset = utcOffset;
		this.name = name;
	}

	/**
	 * Get the current (your) time in the selected time zone
	 *
	 * @return Your time in the selected time zone
	 */
	public OffsetDateTime getCurrentTime() {
		final OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);

		return now.plusMinutes(utcOffset);
	}

	/**
	 * Convert a {@link OffsetDateTime} to the selected time zone
	 *
	 * @param odt The {@link OffsetDateTime} to convert
	 * @return The converted {@link OffsetDateTime}
	 */
	public OffsetDateTime getTime(final OffsetDateTime odt) {
		return getTimeFor(toUTC(odt)).plusMinutes(utcOffset);
	}

	private OffsetDateTime getTimeFor(final OffsetDateTime odt) {
		return getTimeFor(odt.getYear(), odt.getMonthValue(), odt.getDayOfMonth(), odt.getHour(), odt.getMinute(), odt.getSecond(), odt.getNano());
	}

	/**
	 * Get the time for a certain time zone at a certain point
	 *
	 * @param year The year
	 * @param month The month (1 - 12)
	 * @param day The day of the month
	 * @param hour The hour of the day
	 * @param minute The minute of the day
	 * @param second The second of the day
	 * @param nanoSecond The nanosecond of the day
	 * @return The time in this certain zone
	 */
	public OffsetDateTime getTimeFor(final int year, final int month, final int day, final int hour, final int minute, final int second, final int nanoSecond) {
		return OffsetDateTime.of(year, month, day, hour, minute, second, nanoSecond, ZoneOffset.ofHoursMinutes(getHours(), getMinutes()));
	}

	/**
	 * Get the name of this zone
	 *
	 * @return The name of this zone
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the hour offset of this zone towards UTC
	 *
	 * @return The hour offset of this zone towards UTC
	 */
	public int getHours() {
		return (int)(utcOffset / 60);
	}

	/**
	 * Get the minute offset of this zone towards UTC
	 *
	 * @return The minute offset of this zone towards UTC
	 */
	public int getMinutes() {
		return (int)(utcOffset - getHours() * 60);
	}

}
