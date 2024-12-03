package com.thetestingacademy.samplecheck.samplecheck1;

public class APITest_005_NonBuilderPatternDesign {
    public void step1(){
        System.out.println("Step1");

    }
    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(String name){
        System.out.println("Step3");
    }

    public static void main(String[] args) {
        APITest_005_NonBuilderPatternDesign np = new APITest_005_NonBuilderPatternDesign();
        np.step1();
        np.step2();
        np.step3("Ramya");



    }


}
