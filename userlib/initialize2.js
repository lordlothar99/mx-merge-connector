!function () {
    "use strict";
    var e = "merge-link-iframe", n = function () {
        return document.getElementById(e)
    }, o = {
        isLinkOpen: !1, isIFrameCreated: !1, isIFrameReady: !1, linkToken: void 0, onExit: function () {
        }, onSuccess: function () {
        }, onLoad: function () {
        }, onIFrameReady: function () {
        }
    }, i = function () {
        var e, i = n();
        null != i.contentWindow && (o.linkToken && "0" !== o.linkToken || o.demoCategories) && i.contentWindow.postMessage({
            messageType: "SEND_INFO_TO_IFRAME",
            linkToken: null !== (e = o.linkToken) && void 0 !== e ? e : "0",
            demoInfo: o.demoCategories ? {demoCategories: o.demoCategories, organizationID: o.organizationID} : void 0
        }, "*")
    }, t = function () {
        document.body.style.overflow = "auto", document.body.style.height = "auto";
        var e = n();
        e.style.display = "none", o.isLinkOpen = !1, null != e.contentWindow && e.contentWindow.postMessage({messageType: "EXIT_MERGE_LINK"}, "*")
    };
    window.addEventListener("message", (function (e) {
        var n = e.data, a = n.publicToken;
        switch (n.messageType) {
            case"SEND_PUBLIC_TOKEN_TO_PARENT":
                return o.onSuccess(a), void t();
            case"LINKING_FLOW_READY_FOR_LINK_TOKEN":
                return o.isIFrameReady = !0, o.onIFrameReady(), void i();
            case"INTEGRATIONS_LOADED":
                return void o.onIFrameReady();
            case"CLOSE_LINKING_FLOW":
                return t(), void (o.onExit && o.onExit())
        }
    })), window.MergeLink = {
        initialize: function (n) {
            var t, a = n.linkToken, d = n.onSuccess, s = n.onReady, r = n.onLoad, l = n.demo_demo_categories,
                c = n.organization_organization_id, u = n.onExit;
            o.linkToken = a, o.onSuccess = null != d ? d : function () {
            }, o.onIFrameReady = null != s ? s : function () {
            }, o.onLoad = null != r ? r : function () {
            }, o.demoCategories = l, o.organizationID = c, o.onExit = null != u ? u : function () {
            }, !1 === o.isIFrameCreated ? (o.isIFrameCreated = !0, (t = document.createElement("iframe")).id = e, t.height = "100%", t.width = "100%", t.style.display = "none", t.style.position = "fixed", t.style.top = "0", t.style.left = "0", t.style.right = "0", t.style.bottom = "0", t.style.zIndex = "9999999999", t.style.borderWidth = "0", t.style.overflowX = "hidden", t.style.overflowY = "auto", t.style.backgroundColor = "transparent", t.src = "https://cdn.merge.dev/index.html", document.body.appendChild(t), t.addEventListener("load", (function () {
                o.onIFrameReady(), o.onLoad && o.onLoad()
            }))) : o.isIFrameReady && (o.onIFrameReady(), i())
        }, openLink: function (e) {
            var t = n();
            e && e.linkToken !== o.linkToken && (o.linkToken = e.linkToken, i()), t.style.display = "block", document.body.style.overflow = "hidden", document.body.style.height = "100%", o.isLinkOpen = !0
        }, closeLink: t
    }
}();