/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.builder;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/fir/rawBuilder")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class RawFirBuilderTestCaseGenerated extends AbstractRawFirBuilderTestCase {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doRawFirTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInRawBuilder() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/fir/rawBuilder"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/fir/rawBuilder/declarations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Declarations extends AbstractRawFirBuilderTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doRawFirTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInDeclarations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/fir/rawBuilder/declarations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("complexTypes.kt")
        public void testComplexTypes() throws Exception {
            runTest("compiler/testData/fir/rawBuilder/declarations/complexTypes.kt");
        }

        @TestMetadata("enums.kt")
        public void testEnums() throws Exception {
            runTest("compiler/testData/fir/rawBuilder/declarations/enums.kt");
        }

        @TestMetadata("noPrimaryConstructor.kt")
        public void testNoPrimaryConstructor() throws Exception {
            runTest("compiler/testData/fir/rawBuilder/declarations/noPrimaryConstructor.kt");
        }

        @TestMetadata("simpleClass.kt")
        public void testSimpleClass() throws Exception {
            runTest("compiler/testData/fir/rawBuilder/declarations/simpleClass.kt");
        }

        @TestMetadata("simpleFun.kt")
        public void testSimpleFun() throws Exception {
            runTest("compiler/testData/fir/rawBuilder/declarations/simpleFun.kt");
        }

        @TestMetadata("typeParameters.kt")
        public void testTypeParameters() throws Exception {
            runTest("compiler/testData/fir/rawBuilder/declarations/typeParameters.kt");
        }
    }
}