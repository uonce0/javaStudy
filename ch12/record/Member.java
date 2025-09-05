package ch12.record;

// 불변 dto
//public class Member {
//	private String id;
//	private String name;
//	private int age;
//}

public record Member(String id, String name, int age) {}