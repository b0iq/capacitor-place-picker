import { registerPlugin } from '@capacitor/core';

import type { PlacePickerPlugin } from './definitions';

const PlacePicker = registerPlugin<PlacePickerPlugin>('PlacePicker', {
  web: () => import('./web').then(m => new m.PlacePickerWeb()),
});

export * from './definitions';
export { PlacePicker };
