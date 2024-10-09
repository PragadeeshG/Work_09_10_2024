package com.test1;

public class ApiEngineTypes {
	private Integer appEngineCode;
	private String standardTypes;
	private boolean standardTypeFlag;
	private Integer instanceClassCode;
	private String className;
	private String memoryLimit;
	private Integer cpuLimit;
	private Integer automaticScalingMax;
	private String scalingType;
	private Integer basicScalingMax;
	private Integer manualScalingMax;
	private String status;
	private String quaotasAndLimits;

	public ApiEngineTypes() {

	}

	public ApiEngineTypes(Integer appEngineCode, String standardTypes, boolean standardTypeFlag,
			Integer instanceClassCode, String className, String memoryLimit, Integer cpuLimit,
			Integer automaticScalingMax, String scalingType, Integer basicScalingMax, Integer manualScalingMax,
			String status, String quaotasAndLimits) {
		super();
		this.appEngineCode = appEngineCode;
		this.standardTypes = standardTypes;
		this.standardTypeFlag = standardTypeFlag;
		this.instanceClassCode = instanceClassCode;
		this.className = className;
		this.memoryLimit = memoryLimit;
		this.cpuLimit = cpuLimit;
		this.automaticScalingMax = automaticScalingMax;
		this.scalingType = scalingType;
		this.basicScalingMax = basicScalingMax;
		this.manualScalingMax = manualScalingMax;
		this.status = status;
		this.quaotasAndLimits = quaotasAndLimits;
	}

	public Integer getAppEngineCode() {
		return appEngineCode;
	}

	public void setAppEngineCode(Integer appEngineCode) {
		this.appEngineCode = appEngineCode;
	}

	public String getStandardTypes() {
		return standardTypes;
	}

	public void setStandardTypes(String standardTypes) {
		this.standardTypes = standardTypes;
	}

	public boolean isStandardTypeFlag() {
		return standardTypeFlag;
	}

	public void setStandardTypeFlag(boolean standardTypeFlag) {
		this.standardTypeFlag = standardTypeFlag;
	}

	public Integer getInstanceClassCode() {
		return instanceClassCode;
	}

	public void setInstanceClassCode(Integer instanceClassCode) {
		this.instanceClassCode = instanceClassCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMemoryLimit() {
		return memoryLimit;
	}

	public void setMemoryLimit(String memoryLimit) {
		this.memoryLimit = memoryLimit;
	}

	public Integer getCpuLimit() {
		return cpuLimit;
	}

	public void setCpuLimit(Integer cpuLimit) {
		this.cpuLimit = cpuLimit;
	}

	public Integer getAutomaticScalingMax() {
		return automaticScalingMax;
	}

	public void setAutomaticScalingMax(Integer automaticScalingMax) {
		this.automaticScalingMax = automaticScalingMax;
	}

	public String getScalingType() {
		return scalingType;
	}

	public void setScalingType(String scalingType) {
		this.scalingType = scalingType;
	}

	public Integer getBasicScalingMax() {
		return basicScalingMax;
	}

	public void setBasicScalingMax(Integer basicScalingMax) {
		this.basicScalingMax = basicScalingMax;
	}

	public Integer getManualScalingMax() {
		return manualScalingMax;
	}

	public void setManualScalingMax(Integer manualScalingMax) {
		this.manualScalingMax = manualScalingMax;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQuaotasAndLimits() {
		return quaotasAndLimits;
	}

	public void setQuaotasAndLimits(String quaotasAndLimits) {
		this.quaotasAndLimits = quaotasAndLimits;
	}

}
