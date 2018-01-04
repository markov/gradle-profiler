package org.gradle.profiler.mutations;

import java.io.File;

public class ApplyAbiChangeToKotlinSingleModuleSourceFileMutator extends AbstractFileChangeMutator {
    public ApplyAbiChangeToKotlinSingleModuleSourceFileMutator(File sourceFile) {
        super(sourceFile);
    }

    @Override
    protected void applyChangeTo(StringBuilder text) {
        String methodName = "_m_" + getUniqueText();
        text.replace(
                0,
                text.length(),
                "package org.gradle.test.performancenull_458\n" +
                        "class Productionnull_45800(val property: String) {\n" +
                        "    var prop0: String? = null\n" +
                        "    var prop1: String? = null\n" +
                        "    fun " + methodName + "() {\n" +
                        "        System.out.println(\"" + methodName + "\")\n" +
                        "    }\n" +
                        "}\n");
    }
}
