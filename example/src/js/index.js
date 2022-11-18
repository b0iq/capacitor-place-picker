/* eslint-disable no-undef */
import { PlacePicker } from 'capacitor-place-picker';

const pickPlaceButton = document.getElementById('pick-place-button');
const pickPlaceButtonWithOptions = document.getElementById(
  'pick-place-button-with-options',
);
pickPlaceButton.addEventListener('click', () => {
  // TODO:
  PlacePicker.pickPlace();
  console.log('Pick place button clicked');
});
pickPlaceButtonWithOptions.addEventListener('click', () => {
  // TODO:
  console.log('Pick place button clicked');
});
