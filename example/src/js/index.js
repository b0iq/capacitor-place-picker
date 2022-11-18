/* eslint-disable no-undef */
import { PlacePicker } from 'capacitor-place-picker';

const codeEl = document.getElementById('code');
const pickPlaceButton = document.getElementById('pick-place-button');
const pickPlaceButtonWithOptions = document.getElementById(
  'pick-place-button-with-options',
);
pickPlaceButton.addEventListener('click', async () => {
  // TODO:
  const r = await PlacePicker.pickPlace();
  codeEl.innerText = JSON.stringify(r, null, 2);
});
pickPlaceButtonWithOptions.addEventListener('click', async () => {
  // TODO:
  const r = await PlacePicker.pickPlace({ color: '#005fab' });
  codeEl.innerText = JSON.stringify(r, null, 2);
});
