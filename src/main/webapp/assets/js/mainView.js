/**
 * Created by KAKolesnikov on 2015-04-29.
 */
webix.ready(function () {
    var screenWidth = window.screen.availWidth;
    var columns = [
        {id: "date", header: "Date of transaction", width: (screenWidth / 6), editor:"date"},
        {id: "amount", header: "Amount", width: (screenWidth / 6), editor:"text"},
        {id: "descr", header: "Description", width: (screenWidth / 6) * 4 - 20, editor:"popup"}
    ];

    webix.ui({
        type: "line",
        rows: [
            {
                view: "toolbar", id: "topBar",
                elements: [
                    {view: "button", value: "Add Entry", click: "add_row"},
                    {view: "button", value: "Save changes"},
                    {view: "button", value: "Exit"}]
            },
            {
                view: "datatable", id: "data",
                container: "container",
                select:"cell",
                editable:true,
                editaction:"dblclick",
                columns:columns
            }
        ]
    });
});

function add_row() {
    moment.locale('en-AU');
    var id = $$("data").add({date: new moment(), amount: "new", descr: "new"});
    //$$("data").editCell(id);
}
