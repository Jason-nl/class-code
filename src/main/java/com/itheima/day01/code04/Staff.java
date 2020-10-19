package com.itheima.day01.code04;

public abstract class Staff {
    //工号、姓名、年龄
    private String jobId;
    private String name;
    private int age;

    public void notice(String content) {
        System.out.println("通知:");
        setContent(content);
        System.out.println("\\t必胜环球科技有限公司");
    }

    public abstract void setContent(String content);

    public Staff() {
    }

    public Staff(String jobId, String name, int age) {
        this.jobId = jobId;
        this.name = name;
        this.age = age;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
