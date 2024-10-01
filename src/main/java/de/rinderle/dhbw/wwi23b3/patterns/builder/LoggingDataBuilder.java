package de.rinderle.dhbw.wwi23b3.patterns.builder;

public class LoggingDataBuilder {
    private String className;
    private String methodName;
    public LoggingDataBuilder withClassName(String className) {
        this.className = className;
        this.methodName = null;
        return this;
    }
//      public LoggingDataBuilder withMethodName(String methodName) {
//      return new LoggingData();
//    }
//}
