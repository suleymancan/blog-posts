$(function () {

  const url = location.protocol + '//' + location.host + location.pathname;

  $('.sortable>th').on('click', function () {
    const sort = $(this).data('sort');

    if (!location.search) {
      if ($(this).hasClass('sortedASC')) {
        window.location.href = url + '?sort=' + sort + ',' + 'DESC';
      }
      else {
        window.location.href = url + '?sort=' + sort + ',' + 'ASC';
      }
    }
    else {
      const justOneSortUrl = removeParam("sort", window.location.href)

      if ($(this).hasClass('sortedASC')) {
        window.location.href = justOneSortUrl + '&sort=' + sort + ',' + 'DESC';
      }
      else {
        window.location.href = justOneSortUrl + '&sort=' + sort + ',' + 'ASC';
      }
    }
  });
});

/*
 This method must be used when the filter and sort are used together in the table.
 In this simple example, the use of this method does not affect the operation even if the filter is not used.
 doc:
 this method removes the incoming key from the url.
 sourceURL: http://localhost:8080/workLogs?projectId=1&sort=employee,ASC
 key: sort
 return: http://localhost:8080/workLogs?projectId=1
 (src: https://stackoverflow.com/questions/16941104/remove-a-parameter-to-the-url-with-javascript)
 */
function removeParam(key, sourceURL) {
  let rtn = sourceURL.split("?")[0],
      param,
      paramsArr = [],
      queryString = (sourceURL.indexOf("?") !== -1) ? sourceURL.split("?")[1] : "";
  if (queryString !== "") {
    paramsArr = queryString.split("&");
    for (let i = paramsArr.length - 1; i >= 0; i -= 1) {
      param = paramsArr[i].split("=")[0];
      if (param === key) {
        paramsArr.splice(i, 1);
      }
    }
    rtn = rtn + "?" + paramsArr.join("&");
  }
  return rtn;
}
