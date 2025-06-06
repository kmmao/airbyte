# Plausible

## Requirements

- [Plausible account](https://plausible.io/)
- Plausible [API key](https://plausible.io/docs/stats-api)

## Supported sync modes

| Feature           | Supported?\(Yes/No\) | Notes                                                                                          |
| :---------------- | :------------------- | :--------------------------------------------------------------------------------------------- |
| Full Refresh Sync | Yes                  | [Overwrite](https://docs.airbyte.com/understanding-airbyte/connections/full-refresh-overwrite) |
| Incremental Sync  | No                   |                                                                                                |

## Supported Streams

- [Stats - Time Series](https://plausible.io/docs/stats-api#get-apiv1statstimeseries)

## Setup steps
1. [Log into your Airbyte Cloud](https://cloud.airbyte.com/workspaces) account or navigate to the Airbyte Open Source dashboard.
2. Click **Sources** and then click **+ New source**.
3. On the Set up the source page, select **Plausible** from the Source type dropdown.
4. Enter a name for the connector
5. Enter the following configurations:
    - **API Key**: Plausible API Key. See the <a href="https://plausible.io/docs/stats-api">docs</a> for information on how to generate this key.
    - **Site ID**: The domain of the site you want to retrieve data for. Enter the name of your site as configured on Plausible, i.e., excluding "https://" and "www". Can be retrieved from the 'domain' field in your Plausible site settings.
    - **API URL**: The API URL of your plausible instance. Change this if you self-host plausible. Otherwise it will default to https://plausible.io/api/v1/stats
    - **start_date**: Data start date Start date for data to retrieve, in ISO-8601 format.


### Notes

Plausible is a privacy-first analytics service, and the data available from its API is intentionally 1) less granular and 2) less comprehensive than those available from Google Analytics. As such:

1. when retrieving multi-day data, [metrics](https://plausible.io/docs/stats-api#metrics) are aggregated to a daily grain; and
2. [non-metric properties](https://plausible.io/docs/stats-api#properties) (e.g., referrer, entry page, exit page) cannot be directly exported, only [grouped on](https://plausible.io/docs/stats-api#get-apiv1statsbreakdown).

Thus, this source connector retrieves [all possible metrics](https://plausible.io/docs/stats-api#metrics) on a daily grain, for all days with nonzero website activity.

## Performance Considerations

The [stated rate limit](https://plausible.io/docs/stats-api) is 600 requests per hour per API key, with higher capacities potentially available [upon request](https://plausible.io/contact).

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject        |
|:--------|:-----------| :------------------------------------------------------- | :------------- |
| 0.2.14 | 2025-05-24 | [60528](https://github.com/airbytehq/airbyte/pull/60528) | Update dependencies |
| 0.2.13 | 2025-05-10 | [60098](https://github.com/airbytehq/airbyte/pull/60098) | Update dependencies |
| 0.2.12 | 2025-05-03 | [59483](https://github.com/airbytehq/airbyte/pull/59483) | Update dependencies |
| 0.2.11 | 2025-04-27 | [59083](https://github.com/airbytehq/airbyte/pull/59083) | Update dependencies |
| 0.2.10 | 2025-04-19 | [58482](https://github.com/airbytehq/airbyte/pull/58482) | Update dependencies |
| 0.2.9 | 2025-04-12 | [57854](https://github.com/airbytehq/airbyte/pull/57854) | Update dependencies |
| 0.2.8 | 2025-04-05 | [57358](https://github.com/airbytehq/airbyte/pull/57358) | Update dependencies |
| 0.2.7 | 2025-03-29 | [56803](https://github.com/airbytehq/airbyte/pull/56803) | Update dependencies |
| 0.2.6 | 2025-03-22 | [56236](https://github.com/airbytehq/airbyte/pull/56236) | Update dependencies |
| 0.2.5 | 2025-03-08 | [55536](https://github.com/airbytehq/airbyte/pull/55536) | Update dependencies |
| 0.2.4 | 2025-03-01 | [55010](https://github.com/airbytehq/airbyte/pull/55010) | Update dependencies |
| 0.2.3 | 2025-02-23 | [54559](https://github.com/airbytehq/airbyte/pull/54559) | Update dependencies |
| 0.2.2 | 2025-02-15 | [48194](https://github.com/airbytehq/airbyte/pull/48194) | Update dependencies |
| 0.2.1 | 2024-08-16 | [44196](https://github.com/airbytehq/airbyte/pull/44196) | Bump source-declarative-manifest version |
| 0.2.0 | 2024-08-14 | [44085](https://github.com/airbytehq/airbyte/pull/44085) | Refactor connector to manifest-only format |
| 0.1.14 | 2024-08-12 | [43731](https://github.com/airbytehq/airbyte/pull/43731) | Update dependencies |
| 0.1.13 | 2024-08-10 | [43680](https://github.com/airbytehq/airbyte/pull/43680) | Update dependencies |
| 0.1.12 | 2024-08-06 | [42793](https://github.com/airbytehq/airbyte/pull/43048) | new API URL config option available |
| 0.1.11 | 2024-08-03 | [43252](https://github.com/airbytehq/airbyte/pull/43252) | Update dependencies |
| 0.1.10 | 2024-07-27 | [42793](https://github.com/airbytehq/airbyte/pull/42793) | Update dependencies |
| 0.1.9 | 2024-07-20 | [41918](https://github.com/airbytehq/airbyte/pull/41918) | Update dependencies |
| 0.1.8 | 2024-07-10 | [41403](https://github.com/airbytehq/airbyte/pull/41403) | Update dependencies |
| 0.1.7 | 2024-07-09 | [41120](https://github.com/airbytehq/airbyte/pull/41120) | Update dependencies |
| 0.1.6 | 2024-07-06 | [40992](https://github.com/airbytehq/airbyte/pull/40992) | Update dependencies |
| 0.1.5 | 2024-06-25 | [40502](https://github.com/airbytehq/airbyte/pull/40502) | Update dependencies |
| 0.1.4 | 2024-06-22 | [40185](https://github.com/airbytehq/airbyte/pull/40185) | Update dependencies |
| 0.1.3 | 2024-06-04 | [38974](https://github.com/airbytehq/airbyte/pull/38974) | [autopull] Upgrade base image to v1.2.1 |
| 0.1.2 | 2024-05-28 | [38660](https://github.com/airbytehq/airbyte/pull/38660) | Make connector compatible with Builder |
| 0.1.1 | 2024-05-21 | [38494](https://github.com/airbytehq/airbyte/pull/38494) | [autopull] base image + poetry + up_to_date |
| 0.1.0 | 2022-10-30 | [18657](https://github.com/airbytehq/airbyte/pull/18657) | Initial commit |

</details>
