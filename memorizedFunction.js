// this HOF return a memorized func, it has a scope for caching arguments & output
function memorize(func) {
  let lastInput = null;
  let lastOuput = null;
  return function() {
    if (!isArgumentsEqual(lastInput, arguments)) {
      lastOuput = func.apply(null, arguments);
    }
    lastInput = arguments;
    return lastOuput;
  }
}

// shallow compare arguments by === (same reference means equality)
function isArgumentsEqual(prev, next) {
  if (prev === null || next === null || prev.length !== next.length) {
    return false
  }
  for (let i = 0; i < prev.length; i++) {
    if (prev[i] !== next[i]) {
      return false
    }
  }
  return true
}