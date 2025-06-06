# ConvertKit

## Sync overview

This source can sync data from the [ConvertKit API](https://developers.convertkit.com/#getting-started). At present this connector only supports full refresh syncs meaning that each time you use the connector it will sync all available records from scratch. Please use cautiously if you expect your API to have a lot of records.

## This Source Supports the Following Streams

- sequences
- subscribers
- broadcasts
- tags
- forms

### Features

| Feature           | Supported?\(Yes/No\) | Notes |
| :---------------- | :------------------- | :---- |
| Full Refresh Sync | Yes                  |       |
| Incremental Sync  | No                   |       |

### Performance considerations

The connector has a rate limit of no more than 120 requests over a rolling 60 second period, for a given api secret.

## Getting started

### Requirements

- ConvertKit API Secret

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject        |
| :------ | :--------- | :------------------------------------------------------- | :------------- |
| 0.3.3 | 2025-05-24 | [60414](https://github.com/airbytehq/airbyte/pull/60414) | Update dependencies |
| 0.3.2 | 2025-05-10 | [59955](https://github.com/airbytehq/airbyte/pull/59955) | Update dependencies |
| 0.3.1 | 2025-05-03 | [59410](https://github.com/airbytehq/airbyte/pull/59410) | Update dependencies |
| 0.3.0 | 2025-04-24 | [58617](https://github.com/airbytehq/airbyte/pull/58617) | Update to Kit API v4, add OAuth support, add 8 additional streams, update schemas |
| 0.2.23 | 2025-04-26 | [58849](https://github.com/airbytehq/airbyte/pull/58849) | Update dependencies |
| 0.2.22 | 2025-04-19 | [58341](https://github.com/airbytehq/airbyte/pull/58341) | Update dependencies |
| 0.2.21 | 2025-04-12 | [57808](https://github.com/airbytehq/airbyte/pull/57808) | Update dependencies |
| 0.2.20 | 2025-04-05 | [57198](https://github.com/airbytehq/airbyte/pull/57198) | Update dependencies |
| 0.2.19 | 2025-03-29 | [56524](https://github.com/airbytehq/airbyte/pull/56524) | Update dependencies |
| 0.2.18 | 2025-03-22 | [55951](https://github.com/airbytehq/airbyte/pull/55951) | Update dependencies |
| 0.2.17 | 2025-03-08 | [55270](https://github.com/airbytehq/airbyte/pull/55270) | Update dependencies |
| 0.2.16 | 2025-03-01 | [54976](https://github.com/airbytehq/airbyte/pull/54976) | Update dependencies |
| 0.2.15 | 2025-02-22 | [54379](https://github.com/airbytehq/airbyte/pull/54379) | Update dependencies |
| 0.2.14 | 2025-02-15 | [53751](https://github.com/airbytehq/airbyte/pull/53751) | Update dependencies |
| 0.2.13 | 2025-02-08 | [53342](https://github.com/airbytehq/airbyte/pull/53342) | Update dependencies |
| 0.2.12 | 2025-02-01 | [52823](https://github.com/airbytehq/airbyte/pull/52823) | Update dependencies |
| 0.2.11 | 2025-01-25 | [52332](https://github.com/airbytehq/airbyte/pull/52332) | Update dependencies |
| 0.2.10 | 2025-01-18 | [51673](https://github.com/airbytehq/airbyte/pull/51673) | Update dependencies |
| 0.2.9 | 2025-01-11 | [51107](https://github.com/airbytehq/airbyte/pull/51107) | Update dependencies |
| 0.2.8 | 2024-12-28 | [50522](https://github.com/airbytehq/airbyte/pull/50522) | Update dependencies |
| 0.2.7 | 2024-12-21 | [50066](https://github.com/airbytehq/airbyte/pull/50066) | Update dependencies |
| 0.2.6 | 2024-12-14 | [49510](https://github.com/airbytehq/airbyte/pull/49510) | Update dependencies |
| 0.2.5 | 2024-12-12 | [48958](https://github.com/airbytehq/airbyte/pull/48958) | Update dependencies |
| 0.2.4 | 2024-11-04 | [48217](https://github.com/airbytehq/airbyte/pull/48217) | Update dependencies |
| 0.2.3 | 2024-10-29 | [47764](https://github.com/airbytehq/airbyte/pull/47764) | Update dependencies |
| 0.2.2 | 2024-10-28 | [47619](https://github.com/airbytehq/airbyte/pull/47619) | Update dependencies |
| 0.2.1 | 2024-08-16 | [44196](https://github.com/airbytehq/airbyte/pull/44196) | Bump source-declarative-manifest version |
| 0.2.0 | 2024-08-15 | [44161](https://github.com/airbytehq/airbyte/pull/44161) | Refactor connector to manifest-only format |
| 0.1.14 | 2024-08-12 | [43803](https://github.com/airbytehq/airbyte/pull/43803) | Update dependencies |
| 0.1.13 | 2024-08-10 | [43503](https://github.com/airbytehq/airbyte/pull/43503) | Update dependencies |
| 0.1.12 | 2024-08-03 | [43237](https://github.com/airbytehq/airbyte/pull/43237) | Update dependencies |
| 0.1.11 | 2024-07-27 | [42643](https://github.com/airbytehq/airbyte/pull/42643) | Update dependencies |
| 0.1.10 | 2024-07-20 | [42363](https://github.com/airbytehq/airbyte/pull/42363) | Update dependencies |
| 0.1.9 | 2024-07-13 | [41742](https://github.com/airbytehq/airbyte/pull/41742) | Update dependencies |
| 0.1.8 | 2024-07-10 | [41405](https://github.com/airbytehq/airbyte/pull/41405) | Update dependencies |
| 0.1.7 | 2024-07-09 | [41272](https://github.com/airbytehq/airbyte/pull/41272) | Update dependencies |
| 0.1.6 | 2024-07-06 | [40860](https://github.com/airbytehq/airbyte/pull/40860) | Update dependencies |
| 0.1.5 | 2024-06-25 | [40282](https://github.com/airbytehq/airbyte/pull/40282) | Update dependencies |
| 0.1.4 | 2024-06-22 | [39989](https://github.com/airbytehq/airbyte/pull/39989) | Update dependencies |
| 0.1.3 | 2024-06-17 | [39505](https://github.com/airbytehq/airbyte/pull/39505) | Make compatible with builder |
| 0.1.2 | 2024-06-06 | [39299](https://github.com/airbytehq/airbyte/pull/39299) | [autopull] Upgrade base image to v1.2.2 |
| 0.1.1 | 2024-05-21 | [38492](https://github.com/airbytehq/airbyte/pull/38492) | [autopull] base image + poetry + up_to_date |
| 0.1.0 | 2022-10-25 | [18455](https://github.com/airbytehq/airbyte/pull/18455) | Initial commit |

</details>
