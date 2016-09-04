memoria-b
=========

Back-end of project __Memoria__

## Description

New version of **Memoria**, based on a grails application providing a REST JSON API

params:

- **fromDate:** Starting date of the period to query [Required]
- **toDate:** Ending date of the period to query [Required]
- **view:** Zoom value (0 to 4) [Required]
- **category:** Id of the category to filter from
- **country:** Id of the country to filter from [Múltiple]

Examples:

- url/MEvent/filter?fromDate=01/01/1800&toDate=01/01/1900&view=2
- url/MEvent/filter?fromDate=01/01/1800&toDate=01/01/1900&view=2&category=2
- url/MEvent/filter?fromDate=01/01/1800&toDate=01/01/1900&view=2&category=2&country=12&country=78
