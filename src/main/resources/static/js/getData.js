$(function () {
   $.post({
       url:'user/getAll',
       success:function (data) {
           var obj=$("table");
           for (var i=0;i<data.length;i++){
               var text="<tr>" +
                           "<td>"+data[i].id+"</td>" +
                           "<td>"+data[i].username+"</td>" +
                           "<td>"+data[i].password+"</td>" +
                           "<td>"+data[i].createTime+"</td>" +
                   "<td><a href=\"\" class='btn btn-success'>修改</a>" +
                   "<a href=\"user/delete?id="+data[i].id+"\" class='btn btn-danger'>删除</a></td>" +
                        "</tr>";
               obj.append(text);
           }
       }
   });
});