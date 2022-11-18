import { WebPlugin } from '@capacitor/core';

import type { PlacePickerPlugin } from './definitions';

export class PlacePickerWeb extends WebPlugin implements PlacePickerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
