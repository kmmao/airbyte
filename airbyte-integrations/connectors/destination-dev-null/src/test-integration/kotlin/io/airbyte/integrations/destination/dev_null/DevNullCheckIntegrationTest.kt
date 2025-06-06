/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.dev_null

import io.airbyte.cdk.command.FeatureFlag
import io.airbyte.cdk.load.check.CheckIntegrationTest
import io.airbyte.cdk.load.check.CheckTestConfig
import java.util.regex.Pattern
import org.junit.jupiter.api.Test

class DevNullCheckIntegrationTest :
    CheckIntegrationTest<DevNullSpecificationOss>(
        successConfigFilenames =
            listOf(
                CheckTestConfig(DevNullTestUtils.loggingConfigPath.toFile().readText()),
            ),
        failConfigFilenamesAndFailureReasons =
            mapOf(
                // cloud doesn't support logging mode, so this should fail
                // when trying to parse the config
                CheckTestConfig(
                    DevNullTestUtils.loggingConfigPath.toFile().readText(),
                    setOf(FeatureFlag.AIRBYTE_CLOUD_DEPLOYMENT)
                ) to
                    Pattern.compile("failed to map valid json to class .*DevNullSpecificationCloud")
            ),
    ) {

    @Test
    override fun testSuccessConfigs() {
        super.testSuccessConfigs()
    }

    @Test
    override fun testFailConfigs() {
        super.testFailConfigs()
    }
}
