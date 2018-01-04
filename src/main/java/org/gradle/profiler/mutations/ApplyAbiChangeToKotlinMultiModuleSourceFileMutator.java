package org.gradle.profiler.mutations;

import java.io.File;

public class ApplyAbiChangeToKotlinMultiModuleSourceFileMutator extends AbstractFileChangeMutator {
    public ApplyAbiChangeToKotlinMultiModuleSourceFileMutator(File sourceFile) {
        super(sourceFile);
    }

    @Override
    protected void applyChangeTo(StringBuilder text) {
        String methodName = "_m_" + getUniqueText();
        text.replace(
                0,
                text.length(),
                "package org.gradle.test.performance1_4\n" +
                        "open class Production1_315 {\n" +
                        "    private val property: String= \"foo\"\n" +
                        "    open fun getProperty(): String {\n" +
                        "        " + methodName + "()\n" +
                        "        return property\n" +
                        "    }\n" +
                        "    fun " + methodName + "() {\n" +
                        "        System.out.println(\"" + methodName + "\")\n" +
                        "    }\n" +
                        "}\n");
    }
}
