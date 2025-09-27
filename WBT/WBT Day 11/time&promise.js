setImmediate(function A() {
  console.log("1st immediate");
});

process.nextTick(function C() {
  console.log("1st process");
});

setTimeout(function B() {
  console.log("1st timeout");
}, 0);

Promise.resolve().then(function D() {
  console.log("1st promise");
});

console.log("program started");
