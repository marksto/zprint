(ns zprint.zfns)

;;
;; # Functions for traversal of either zippers or s-expressions
;;
;; Defined by with-redefs in either sutil.cljc or zutil.cljc
;;

(def zstring nil)
(def znumstr nil)
(def zbyte-array? nil)
(def zcomment? nil)
(def zsexpr nil)
(def zseqnws nil)
(def zmap-right nil)
(def zfocus-style nil)
(def zfirst nil)
(def zsecond nil)
(def zthird nil)
(def znthnext nil)
(def zcount nil)
(def zmap nil)
(def zanonfn? nil)
(def zfn-obj? nil)
(def zfocus nil)
(def zfind-path nil)
(def zwhitespace? nil)
(def zlist? nil)
(def zvector? nil)
(def zmap? nil)
(def zset? nil)
(def zcoll? nil)
(def zuneval? nil)
(def zmeta? nil)
(def ztag nil)
(def zparseuneval nil)
(def zlast nil)
(def zarray? nil)
(def zatom? nil)
(def zderef nil)
(def zrecord? nil)
(def zns? nil)
(def zobj-to-vec nil)
(def zexpandarray nil)
(def znewline? nil)
(def zwhitespaceorcomment? nil)
(def zmap-all nil)
(def zpromise? nil)
(def zfuture? nil)
(def zdelay? nil)
(def zkeyword? nil)
(def zconstant? nil)
(def zagent? nil)
(def zreader-macro? nil)
(def zarray-to-shift-seq nil)
(def zdotdotdot nil)
(def zsymbol? nil)
(def znil? nil)
(def zreader-cond-w-symbol? nil)
(def zreader-cond-w-coll? nil)
(def zlift-ns nil)
