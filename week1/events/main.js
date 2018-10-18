// by default, events are in "bubbling mode" -

// we check the event first on the most inner
// element, then on its parent, and on up to
// the body and the window object

function clickHandler(event, id) {
    // prevent event from continuing
    // to further elements
    // not recommended!
    // event.stopPropagation();

    console.log(`target: ${event.target.id}`);

    // stop any default browser behavior
    // that's already on this event
    // event.preventDefault();

    console.log(id);
}

// document object provided by browser
// "load" event on window means, all
// elements are loaded
// window.onload = function () {


// addEventListener allows multiple listeners
// on the same event.

// DOMContentLoaded on document object is preferred
// to load on window object.
document.addEventListener("DOMContentLoaded", function () {
    // div1: the object created by the browser
    // based on the <div id="one"> in HTML.
    let div1 = document.getElementById("one");
    let div2 = document.getElementById("two");
    let div3 = document.getElementById("three");
    let link = document.getElementById("link");
    let list = document.getElementById("list");

    // console.log(div1);

    div1.addEventListener("mouseover", function (event) {
        console.log("1 b");
    }); // default (false) for bubbling mode
    div2.addEventListener("mouseover", function (event) {
        console.log("2 b");
    });
    div3.addEventListener("mouseover", function (event) {
        console.log("3 b");
    });

    div1.addEventListener("mouseover", function (event) {
        console.log("1 c");
    }, true); // true for capturing mode
    div2.addEventListener("mouseover", function (event) {
        console.log("2 c");
    }, true);
    div3.addEventListener("mouseover", function (event) {
        console.log("3 c");
    }, true);

    link.addEventListener("click", function (event) {
        event.preventDefault(); // stop the "go to page"
                                // default behavior
        console.log("clicked");
        link.innerHTML = "<strong>Clicked</strong>";

        // assignment: make the "ol" get a new item
        // every time you click this link.

        // use document.createElement
        let item = document.createElement("li");
        // and (element).appendChild
        list.appendChild(item);
        // and (element).innerHTML
        item.innerHTML = "new item";
    }, true); // third parameter "true" -> capturing mode
              // instead of bubbling mode
});
