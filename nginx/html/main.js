function getData() {
    fetch('/api/recommend')
      .then(res => res.json())
      .then(data => {
        document.getElementById('result').textContent = JSON.stringify(data, null, 2);
      });
  }
  