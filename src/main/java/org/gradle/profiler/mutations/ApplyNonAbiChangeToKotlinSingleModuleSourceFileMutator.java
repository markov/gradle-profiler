package org.gradle.profiler.mutations;

import java.io.File;

public class ApplyNonAbiChangeToKotlinSingleModuleSourceFileMutator extends AbstractFileChangeMutator {
    public ApplyNonAbiChangeToKotlinSingleModuleSourceFileMutator(File sourceFile) {
        super(sourceFile);
    }

    @Override
    protected void applyChangeTo(StringBuilder text) {
        text.replace(
                0,
                text.length(),
                "package org.gradle.test.performancenull_458\n" +
                        "class Productionnull_45800(val property: String) {\n" +
                        "    var prop0: String? = null\n" +
                        "    var prop1: String? = null\n" +
                        "    fun _m_1231231231231() {\n" +
                        "        System.out.println(\"1231231231231\")\n" +
                        "        System.out.println(\"" + getUniqueText() + "\")\n" +
                        "    }\n" +
                        "}\n");
    }
}
